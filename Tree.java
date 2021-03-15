class Tree{
    public static int ROW=5;
    public static int COL=5;
    public static int LEVEL=5;
    public  static List<String> _tierAll;

    private String name;
    private Tree parent;
    private ArrayList<Tree> children;

    public  Map<String,int[][]> _stat = new HashMap();
    public  ArrayList<Tier> _used  = new ArrayList<Tier>();
    public void setTierAll(String[] tierAll){
        this._tierAll = Arrays.asList(tierAll);
    }
    public  ArrayList<String> getVac(){
        ArrayList<String> canuse = new ArrayList<String>(this._tierAll);
        for (Tier tier: this._used){
            String[] items = tier.getGroupValue();
            if (items == null) continue;
            for (String item : items){
              canuse.remove(item);
            }            
            /*canuse.remove("x"+tier.type.substring(1,2).toUpperCase());
            canuse.remove("x"+tier.type.substring(1,2).toLowerCase());
            canuse.remove("y"+tier.type.substring(1,2).toUpperCase());
            canuse.remove("y"+tier.type.substring(1,2).toLowerCase());
           */
        }
        return canuse;
    }
    public Tree(Tier tier,Tree parent){
        this.name = tier.toString();
        this.children = new ArrayList<Tree>();
        if (parent != null){
            this.parent = parent;
            this._stat = parent._stat;
            this._used = parent._used;
        }
   }
   //half代表是否设定一半的棋盘
   public void setBlankStat(boolean half){
    for (int l=0;l<LEVEL;l++){
         this._stat.put("level"+l,new int[ROW - l][COL - l]);
         int[][] temp =this._stat.get("level"+l); 
         for (int i=0;i<ROW -l;i++){
             for (int j=0;j<COL-l;j++){
               if (half && i+j>=ROW-l){
                   temp[i][j]=99;
               }else{
                   temp[i][j]=0;
               } 
            }
         }
      }
    }
    public String getName(){
        return this.name;
    }
    public ArrayList<Tree> getChildren(){
        return this.children;
    }
    public Tree getParent(){
        return this.parent;
    }
    //获得当前节点tiers列表
    public void getPLM(Set plm){
        plm.add(this.name);
        if (this.parent!=null) {
            this.parent.getPLM(plm);
        }
    }
    public Boolean isValidTier(String tierStr){
        String dir = tierStr.substring(5,6);
        String xy = tierStr.substring(0,1);
        int[][] layout = Tier.getLayout(tierStr.substring(0,2)+dir);
        if (layout==null) return false;
        int level = Integer.parseInt(tierStr.substring(2,3)); 
        int row = Integer.parseInt(tierStr.substring(3,4));
        int col = Integer.parseInt(tierStr.substring(4,5));
        
        for (int[] item :layout){
            //if (tierStr.substring(0,2).equals("xg")){
            //  System.out.println(tierStr+","+level+","+row+","+col+Arrays.toString(item));
            //}
            if (item[1]+row>=this.ROW-(item[0]+level)) return false;
            if (item[2]+col>=this.COL-(item[0]+level)) return false;
            if (xy.equals("x")){
              if (this._stat.get("level"+(item[0]+level))[item[1]+row][item[2]+col]!=0) return false;
            }else{
              if (item[1]+row<0 || item[2]+col<0) return false;  
              if (this._stat.get("level"+(item[0]+level))[item[1]+row][item[2]+col]!=0) return false;  
            }
        }
        return true;
    }
    public int[] findPos(){
      for (int l=0;l<LEVEL;l++){
        for (int i=0;i<ROW-l;i++){
            for (int j=0;j<COL-l;j++){
                if (this._stat.get("level"+l)[i][j]==0){
                    return new int[]{l,i,j};
                }
            }
        }
      }
      return null;
    }
    public ArrayList<Tier> findValid(int[] pos){
        ArrayList<Tier> validTiers=new ArrayList<Tier>();
        String tierStr;
        int[][] layout;
        for (String tierType :this.getVac()){
            for (String dir:new String[]{"N","E","S","W"}){
                layout = Tier.getLayout(tierType+dir);
                if (layout==null) continue;
                int col;
                if (tierType.substring(0,1).equals("y")){
                  col = pos[2];
                }else{
                  col = pos[2] - layout[0][2];  
                }
                //int level = pos[0] - layout[0][0];
                if (col<0){ 
                    //System.out.println("continue:"+tierType+","+dir+",pos:"+Arrays.toString(pos)+",layout:"+Arrays. deepToString(layout));
                    continue;
                }
                tierStr = tierType+pos[0]+pos[1]+col+dir;
                //System.out.println("findValid "+tierStr+" layout:"+Arrays.deepToString(layout));
                if (isValidTier(tierStr)){
                    validTiers.add(new Tier(tierStr));
                }
            }
        }
        return validTiers;
    }

    public Boolean add(Tier tier){
        if (!isValidTier(tier.toString())) return false;
        int[][] layout = tier.getLayout();
        for (int[] item:layout){
            this._stat.get("level"+(item[0]+tier.pos[0]))[item[1]+tier.pos[1]][item[2]+tier.pos[2]]=this._tierAll.indexOf(tier.type)+10;
        }
        this._used.add(new Tier(tier.toString()));
        return true;
    }
    public Boolean remove(){
        if (this.name=="root") return false;
        Tier tier = this._used.remove(this._used.size()-1);
        int[][] layout = tier.getLayout();
        for (int[] item:layout){
            this._stat.get("level"+(item[0]+tier.pos[0]))[item[1]+tier.pos[1]][item[2]+tier.pos[2]]=0;
        }
        return true;
    }
    public Tree addNode(Tier tier){
        this.add(tier);
        Tree  node = new Tree(tier,this);
        this.children.add(node);
        return node;
    }
    public Boolean resolve(int deep){
        //if (this._used.size()>9){
        //    System.out.println(deep+"==>"+this._used);
        //    this.printStat();
        //}
        int [] pos = this.findPos();
        //System.out.println("pos:"+Arrays.toString(pos));
        if (pos==null){
            System.out.println("FIND!!!!");
            return true;
        };
        ArrayList<Tier> validTiers = this.findValid(pos);
        if (validTiers.size()==0){
            return false;
        }else{
              //validTiers.parallelStream().map(validTier->{
              for (Tier validTier:validTiers){
                Tree node = this.addNode(validTier);
                //System.out.println("level"+deep+":"+validTier.toString());
                //System.out.println(this.getVac());
                //this.printStat();
                if (node.resolve(deep++)){
                    return true;
                }
                node.remove();
                //return false;
            };
        }
        return false;
    }
    public void printStat(){
      for (int i=0;i<this.LEVEL;i++){
        System.out.print("[level"+i+"]");  
        int[][] st = this._stat.get("level"+i);
        if (st==null) continue;
        for (int j=0;j<this.ROW - i;j++){
          System.out.println("");
          for (int k=0;k<this.COL - i;k++){
             if (st[j][k]==0) {
               System.out.print("00 ");   
             }else if(st[j][k]==99){
               System.out.print("99 ");                   
             }else{
               System.out.print(this._tierAll.get(st[j][k]-10)+" ");
             }
          }
        }
        System.out.println("");
      }
    }
    public void setStartStat(String[] items){
        for (String item : items){
            System.out.println(item+"==>"+this.add(new Tier(item)));
        }
    }
}
