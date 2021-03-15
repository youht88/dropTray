import java.util.Map;
import java.util.HashMap;
class Tier{
    public static Map<String,int[][]> TierMask =new HashMap<>();
    public String type;
    public String dir;
    public int[] pos ;
    public String getKey(){
        return type+dir;
    }
    public Map<String,String[]> group = new HashMap<String,String[]>(){{
put("浅蓝",new String[]{"xl","yl"}); 
put("紫色",new String[]{"xz","yz"});
put("绿色",new String[]{"xg","yg"});
put("黄色",new String[]{"xy","xY","yy","yY","yu","yU"}); 
put("粉色",new String[]{"xf","yf","yF","ym"});
put("蓝色",new String[]{"xb","yb","yB"});
put("橙色",new String[]{"xo","xO","yo","yO","yt","yT"}); 
put("青色",new String[]{"xq","xQ","yq","yQ","yk","yK"});
put("草绿",new String[]{"xc","xC"});
put("湖蓝",new String[]{"xh","xH","yh","yH","yp","yP"}); 
put("白色",new String[]{"xw","yw","yW"});
put("红色",new String[]{"xr","yr","yR"});
    }};
    public static void init(){
//浅蓝色
TierMask.put("xlN",new int[][]{{0,0,0},{0,0,1},{0,1,0},{0,1,1}});
TierMask.put("ylN",new int[][]{{0,0,0},{1,-1,-1},{1,0,0},{2,-1,-1}});
TierMask.put("ylE",new int[][]{{0,0,0},{1,0,-1},{1,-1,0},{2,-1,-1}});
//紫色
TierMask.put("xzN",new int[][]{{0,0,1},{0,1,0},{0,1,1},{0,1,2},{0,2,1}});
TierMask.put("yzN",new int[][]{{0,0,0},{1,0,0},{2,0,0},{0,1,1},{2,-1,-1}});
TierMask.put("yzE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{0,1,-1},{2,-1,-1}});
//绿色
TierMask.put("xgN",new int[][]{{0,0,0},{0,0,1},{0,0,2},{0,0,3}});
TierMask.put("xgE",new int[][]{{0,0,0},{0,1,0},{0,2,0},{0,3,0}});
TierMask.put("ygN",new int[][]{{0,0,0},{1,0,0},{2,0,0},{3,0,0}});
TierMask.put("ygE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{3,0,-3}});
TierMask.put("ygS",new int[][]{{0,0,0},{1,-1,0},{2,-2,0},{3,-3,0}});
TierMask.put("ygW",new int[][]{{0,0,0},{1,-1,-1},{2,-2,-2},{3,-3,-3}});

//黄色
TierMask.put("xyN",new int[][]{{0,0,0},{0,1,0},{0,1,1},{0,1,2},{0,1,3}});
TierMask.put("xyE",new int[][]{{0,0,0},{0,0,1},{0,1,0},{0,2,0},{0,3,0}});
TierMask.put("xyS",new int[][]{{0,0,0},{0,0,1},{0,0,2},{0,0,3},{0,1,3}});
TierMask.put("xyW",new int[][]{{0,0,1},{0,1,1},{0,2,1},{0,3,0},{0,3,1}});
TierMask.put("xYN",new int[][]{{0,0,3},{0,1,0},{0,1,1},{0,1,2},{0,1,3}});
TierMask.put("xYE",new int[][]{{0,0,0},{0,1,0},{0,2,0},{0,3,0},{0,3,1}});
TierMask.put("xYS",new int[][]{{0,0,0},{0,0,1},{0,0,2},{0,0,3},{0,1,0}});
TierMask.put("xYW",new int[][]{{0,0,0},{0,0,1},{0,1,1},{0,2,1},{0,3,1}});
TierMask.put("yyN",new int[][]{{0,0,0},{1,-1,-1},{2,-1,-1},{3,-1,-1},{4,-1,-1}});
TierMask.put("yyE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{3,0,-3},{4,0,-4}});
TierMask.put("yyS",new int[][]{{0,0,0},{1,-1,0},{2,-1,-1},{3,-1,-2},{4,-1,-3}});
TierMask.put("yyW",new int[][]{{0,0,0},{1,0,0},{2,-1,-1},{3,-2,-2},{4,-3,-3}});

TierMask.put("yYN",new int[][]{{0,0,0},{1,-1,-1},{1,0,0},{2,0,0},{3,0,0}});
TierMask.put("yYE",new int[][]{{0,0,0},{1,-1,0},{1,0,-1},{2,0,-2},{3,0,-3}});
TierMask.put("yYS",new int[][]{{0,0,0},{1,0,-1},{1,-1,0},{2,-2,0},{3,-3,0}});
TierMask.put("yYW",new int[][]{{0,0,0},{1,0,0},{1,-1,-1},{2,-2,-2},{3,-3,-3}});

TierMask.put("yuN",new int[][]{{0,0,0},{1,0,0},{2,0,0},{3,0,0},{2,1,1}});
TierMask.put("yuE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{3,0,-3},{2,1,-3}});
TierMask.put("yuS",new int[][]{{0,0,0},{1,-1,0},{2,-2,0},{3,-3,0},{2,-3,1}});
TierMask.put("yuW",new int[][]{{0,0,0},{1,-1,-1},{2,-2,-2},{3,-3,-3},{2,-3,-3}});

TierMask.put("yUN",new int[][]{{0,0,0},{1,0,0},{2,0,0},{3,0,0},{4,-1,-1}});
TierMask.put("yUE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{3,0,-3},{4,-1,-3}});
TierMask.put("yUS",new int[][]{{0,0,0},{1,-1,0},{2,-2,0},{3,-3,0},{4,-3,-1}});
TierMask.put("yUW",new int[][]{{0,0,0},{1,-1,-1},{2,-2,-2},{3,-3,-3},{4,-3,-3}});

//粉色
TierMask.put("xfN",new int[][]{{0,0,0},{0,1,0},{0,2,0},{0,2,1},{0,2,2}});
TierMask.put("xfE",new int[][]{{0,0,0},{0,0,1},{0,0,2},{0,1,0},{0,2,0}});
TierMask.put("xfS",new int[][]{{0,0,0},{0,0,1},{0,0,2},{0,1,2},{0,2,2}});
TierMask.put("xfW",new int[][]{{0,0,2},{0,1,2},{0,2,0},{0,2,1},{0,2,2}});
TierMask.put("yfN",new int[][]{{0,0,0},{1,0,0},{2,0,0},{1,1,1},{0,2,2}});
TierMask.put("yfE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{1,1,-2},{0,2,-2}});
TierMask.put("yfS",new int[][]{{0,0,0},{1,-1,-1},{2,-2,-2},{1,0,0},{2,0,0}});
TierMask.put("yfW",new int[][]{{0,0,0},{1,-1,0},{2,-2,0},{1,0,-1},{2,0,-2}});

TierMask.put("yFN",new int[][]{{0,0,0},{1,1,1},{2,0,0},{3,1,1},{4,2,2}});
TierMask.put("yFE",new int[][]{{0,0,0},{1,1,3},{2,0,4},{3,1,3},{4,2,2}});
TierMask.put("yFS",new int[][]{{0,0,0},{1,3,1},{2,4,0},{3,3,1},{4,2,2}});
TierMask.put("yFW",new int[][]{{0,0,0},{1,3,3},{2,4,4},{3,3,3},{4,2,2}});

TierMask.put("ymN",new int[][]{{0,0,0},{1,0,0},{2,0,0},{3,-1,-1},{4,-2,-2}});
TierMask.put("ymE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{3,-1,-2},{4,-2,-2}});
TierMask.put("ymS",new int[][]{{0,0,0},{1,-1,0},{2,-2,0},{3,-2,-1},{4,-2,-2}});
TierMask.put("ymW",new int[][]{{0,0,0},{1,-1,-1},{2,-2,-2},{3,-2,-2},{4,-2,-2}});

//蓝色
TierMask.put("xbN",new int[][]{{0,0,0},{0,1,0},{0,1,1}});
TierMask.put("xbE",new int[][]{{0,0,0},{0,0,1},{0,1,0}});
TierMask.put("xbS",new int[][]{{0,0,0},{0,0,1},{0,1,1}});
TierMask.put("xbW",new int[][]{{0,0,1},{0,1,0},{0,1,1}});
TierMask.put("ybN",new int[][]{{0,0,0},{1,-1,-1},{2,-1,-1}});
TierMask.put("ybE",new int[][]{{0,0,0},{1,0,-1},{2,-1,-1}});
TierMask.put("ybS",new int[][]{{0,0,0},{1,-1,0},{2,-1,-1}});
TierMask.put("ybW",new int[][]{{0,0,0},{1,0,0},{2,-1,-1}});
TierMask.put("yBN",new int[][]{{0,0,0},{1,0,0},{0,1,1}});
TierMask.put("yBE",new int[][]{{0,0,0},{1,0,-1},{0,1,-1}});
TierMask.put("yBS",new int[][]{{0,0,0},{1,-1,-1},{1,0,0}});
TierMask.put("yBW",new int[][]{{0,0,0},{1,0,-1},{1,-1,0}});
//橙色
TierMask.put("xoN",new int[][]{{0,0,0},{0,1,0},{0,2,0},{0,2,1}});
TierMask.put("xoE",new int[][]{{0,0,0},{0,0,1},{0,0,2},{0,1,0}});
TierMask.put("xoS",new int[][]{{0,0,0},{0,0,1},{0,1,1},{0,2,1}});
TierMask.put("xoW",new int[][]{{0,0,2},{0,1,0},{0,1,1},{0,1,2}});
TierMask.put("xON",new int[][]{{0,0,1},{0,1,1},{0,2,0},{0,2,1}});
TierMask.put("xOE",new int[][]{{0,0,0},{0,1,0},{0,1,1},{0,1,2}});
TierMask.put("xOS",new int[][]{{0,0,0},{0,0,1},{0,1,0},{0,2,0}});
TierMask.put("xOW",new int[][]{{0,0,0},{0,0,1},{0,0,2},{0,1,2}});

TierMask.put("yoN",new int[][]{{0,0,0},{1,-1,-1},{2,-1,-1},{3,-1,-1}});
TierMask.put("yoE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{3,0,-3}});
TierMask.put("yoS",new int[][]{{0,0,0},{1,-1,0},{2,-1,-1},{3,-1,-2}});
TierMask.put("yoW",new int[][]{{0,0,0},{1,0,0},{2,-1,-1},{3,-2,-2}});

TierMask.put("yON",new int[][]{{0,0,0},{1,-1,-1},{1,0,0},{2,0,0}});
TierMask.put("yOE",new int[][]{{0,0,0},{1,-1,0},{1,0,-1},{2,-1,-1}});
TierMask.put("yOS",new int[][]{{0,0,0},{1,-1,0},{1,0,-1},{2,0,-2}});
TierMask.put("yOW",new int[][]{{0,0,0},{1,0,0},{1,-1,-1},{2,-2,-2}});

TierMask.put("ytN",new int[][]{{0,0,0},{1,0,0},{2,0,0},{1,1,1}});
TierMask.put("ytE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{1,1,-2}});
TierMask.put("ytS",new int[][]{{0,0,0},{1,-1,0},{2,-2,0},{1,-2,1}});
TierMask.put("ytW",new int[][]{{0,0,0},{1,-1,-1},{2,-2,-2},{1,-2,-2}});

TierMask.put("yTN",new int[][]{{0,0,0},{1,0,0},{2,0,0},{3,-1,-1}});
TierMask.put("yTE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{3,0,-3},{4,1,-3}});
TierMask.put("yTS",new int[][]{{0,0,0},{1,-1,0},{2,-2,0},{3,-3,0},{4,-3,1}});
TierMask.put("yTW",new int[][]{{0,0,0},{1,-1,-1},{2,-2,-2},{3,-2,-2}});

//青色
TierMask.put("xqN",new int[][]{{0,0,1},{0,1,0},{0,1,1},{0,1,2},{0,1,3}});
TierMask.put("xqE",new int[][]{{0,0,0},{0,1,0},{0,1,1},{0,2,0},{0,3,0}});
TierMask.put("xqS",new int[][]{{0,0,0},{0,0,1},{0,0,2},{0,0,3},{0,1,2}});
TierMask.put("xqW",new int[][]{{0,0,1},{0,1,1},{0,2,0},{0,2,1},{0,3,1}});
TierMask.put("xQN",new int[][]{{0,0,0},{0,0,1},{0,0,2},{0,0,3},{0,1,1}});
TierMask.put("xQE",new int[][]{{0,0,1},{0,1,0},{0,1,1},{0,2,1},{0,3,1}});
TierMask.put("xQS",new int[][]{{0,0,2},{0,1,0},{0,1,1},{0,1,2},{0,1,3}});
TierMask.put("xQW",new int[][]{{0,0,0},{0,1,0},{0,2,0},{0,2,1},{0,3,0}});

TierMask.put("yqN",new int[][]{{0,0,0},{1,0,0},{2,0,0},{3,0,0},{2,-1,-1}});
TierMask.put("yqE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{3,0,-3},{2,-1,-1}});
TierMask.put("yqS",new int[][]{{0,0,0},{1,-1,0},{2,-2,0},{3,-3,0},{2,-1,-1}});
TierMask.put("yqW",new int[][]{{0,0,0},{1,-1,-1},{2,-2,-2},{3,-3,-3},{2,-1,-1}});

TierMask.put("yQN",new int[][]{{0,0,0},{1,0,0},{2,0,0},{3,0,0},{0,1,1}});
TierMask.put("yQE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{3,0,-3},{0,1,-1}});
TierMask.put("yQS",new int[][]{{0,0,0},{1,-1,0},{2,-2,0},{3,-3,0},{0,-1,1}});
TierMask.put("yQW",new int[][]{{0,0,0},{1,-1,-1},{2,-2,-2},{3,-3,-3},{0,-1,-1}});

TierMask.put("ykN",new int[][]{{0,0,0},{1,0,0},{2,0,0},{3,0,0},{3,-1,-1}});
TierMask.put("ykE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{3,0,-3},{3,-1,-2}});
TierMask.put("ykS",new int[][]{{0,0,0},{1,-1,0},{2,-2,0},{3,-3,0},{3,-2,-1}});
TierMask.put("ykW",new int[][]{{0,0,0},{1,-1,-1},{2,-2,-2},{3,-3,-3},{3,-2,-2}});

TierMask.put("yKN",new int[][]{{0,0,0},{1,0,0},{2,0,0},{3,0,0},{1,1,1}});
TierMask.put("yKE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{3,0,-3},{1,1,-2}});
TierMask.put("yKS",new int[][]{{0,0,0},{1,-1,0},{2,-2,0},{3,-3,-0},{1,-2,1}});
TierMask.put("yKW",new int[][]{{0,0,0},{1,-1,-1},{2,-2,-2},{3,-3,-3},{1,-1,-1}});    

        
//草绿色
TierMask.put("xcN",new int[][]{{0,0,0},{0,1,0},{0,1,1},{0,2,0},{0,2,1}});
TierMask.put("xcE",new int[][]{{0,0,0},{0,0,1},{0,0,2},{0,1,0},{0,1,1}});
TierMask.put("xcS",new int[][]{{0,0,0},{0,0,1},{0,1,0},{0,1,1},{0,2,1}});
TierMask.put("xcW",new int[][]{{0,0,1},{0,0,2},{0,1,0},{0,1,1},{0,1,2}});
TierMask.put("xCN",new int[][]{{0,0,1},{0,1,0},{0,1,1},{0,2,0},{0,2,1}});
TierMask.put("xCE",new int[][]{{0,0,0},{0,0,1},{0,1,0},{0,1,1},{0,1,2}});
TierMask.put("xCS",new int[][]{{0,0,0},{0,0,1},{0,1,0},{0,1,1},{0,2,0}});
TierMask.put("xCW",new int[][]{{0,0,0},{0,0,1},{0,0,2},{0,1,1},{0,1,2}});
//湖蓝
TierMask.put("xhN",new int[][]{{0,0,1},{0,1,0},{0,1,1},{0,2,0},{0,3,0}});
TierMask.put("xhE",new int[][]{{0,0,0},{0,0,1},{0,0,2},{0,1,2},{0,1,3}});
TierMask.put("xhS",new int[][]{{0,0,1},{0,1,1},{0,2,0},{0,2,1},{0,3,0}});
TierMask.put("xhW",new int[][]{{0,0,0},{0,0,1},{0,1,1},{0,1,2},{0,1,3}});
TierMask.put("xHN",new int[][]{{0,0,0},{0,1,0},{0,1,1},{0,2,1},{0,3,1}});
TierMask.put("xHE",new int[][]{{0,0,2},{0,0,3},{0,1,0},{0,1,1},{0,1,2}});
TierMask.put("xHS",new int[][]{{0,0,0},{0,1,0},{0,2,0},{0,2,1},{0,3,1}});
TierMask.put("xHW",new int[][]{{0,0,1},{0,0,2},{0,0,3},{0,1,0},{0,1,1}});

TierMask.put("yhN",new int[][]{{0,0,0},{1,0,0},{0,1,1},{1,1,1},{2,1,1}});
TierMask.put("yhE",new int[][]{{0,0,0},{1,0,-1},{0,1,-1},{1,1,-2},{2,1,-3}});
TierMask.put("yhS",new int[][]{{0,0,0},{1,-1,0},{0,-1,1},{1,-2,1},{2,-2,2}});
TierMask.put("yhW",new int[][]{{0,0,0},{1,-1,-1},{0,-1,-1},{1,-2,-2},{2,-3,-3}});

TierMask.put("yHN",new int[][]{{0,0,0},{1,0,0},{2,-1,-1},{3,-2,-2},{4,-3,-3}});
TierMask.put("yHE",new int[][]{{0,0,0},{1,0,-1},{2,-1,-1},{3,-1,-2},{4,-1,-3}});
TierMask.put("yHS",new int[][]{{0,0,0},{1,-1,0},{2,-1,-1},{3,-2,-1},{4,-2,-2}});
TierMask.put("yHW",new int[][]{{0,0,0},{1,-1,-1},{2,-1,-1},{3,-2,-2},{4,-3,-3}});

TierMask.put("ypN",new int[][]{{0,0,0},{1,0,0},{2,0,0},{1,1,1},{2,1,1}});
TierMask.put("ypE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{1,1,-2},{2,1,-3}});
TierMask.put("ypS",new int[][]{{0,0,0},{1,-1,0},{2,-2,0},{1,-2,1},{2,-3,1}});
TierMask.put("ypW",new int[][]{{0,0,0},{1,-1,-1},{2,-2,-2},{1,-2,-2},{2,-3,-3}});

TierMask.put("yPN",new int[][]{{0,0,0},{1,0,0},{2,0,0},{3,-1,-1},{4,-1,-1}});
TierMask.put("yPE",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{3,-1,-2},{4,-1,-3}});
TierMask.put("yPS",new int[][]{{0,0,0},{1,-1,0},{2,-2,0},{3,-2,-1},{4,-3,-1}});
TierMask.put("yPW",new int[][]{{0,0,0},{1,-1,-1},{2,-2,-2},{3,-2,-2},{4,-3,-3}});    
//白色
TierMask.put("xwN",new int[][]{{0,0,0},{0,0,1},{0,1,0},{0,2,0},{0,2,1}});
TierMask.put("xwE",new int[][]{{0,0,0},{0,0,1},{0,0,2},{0,1,0},{0,1,2}});
TierMask.put("xwS",new int[][]{{0,0,0},{0,0,1},{0,1,1},{0,2,0},{0,2,1}});
TierMask.put("xwW",new int[][]{{0,0,0},{0,0,2},{0,1,0},{0,1,1},{0,1,2}});

TierMask.put("ywN",new int[][]{{0,0,0},{1,-1,-1},{2,-2,-2},{3,-2,-2},{1,0,0}});
TierMask.put("ywE",new int[][]{{0,0,0},{1,-1,0},{2,-2,0},{3,-2,-1},{1,0,-1}});
TierMask.put("ywS",new int[][]{{0,0,0},{1,0,-1},{2,0,-2},{3,-1,-2},{1,-1,0}});
TierMask.put("ywW",new int[][]{{0,0,0},{1,0,0},{2,0,0},{3,-1,-1},{1,-1,-1}});

TierMask.put("yWN",new int[][]{{0,0,0},{1,-1,-1},{2,-1,-1},{3,-1,-1},{2,0,0}});
TierMask.put("yWE",new int[][]{{0,0,0},{1,-1,0},{2,-1,-1},{3,-1,-2},{2,-2,-2}});
TierMask.put("yWS",new int[][]{{0,0,0},{1,0,-1},{2,-1,-1},{3,-2,-1},{2,-2,-2}});
TierMask.put("yWW",new int[][]{{0,0,0},{1,0,0},{2,-1,-1},{3,-2,-2},{2,-2,-2}});

//红色
TierMask.put("xrN",new int[][]{{0,0,0},{0,1,0},{0,1,1},{0,2,1},{0,2,2}});
TierMask.put("xrE",new int[][]{{0,0,1},{0,0,2},{0,1,0},{0,1,1},{0,2,0}});
TierMask.put("xrS",new int[][]{{0,0,0},{0,0,1},{0,1,1},{0,1,2},{0,2,2}});
TierMask.put("xrW",new int[][]{{0,0,2},{0,1,1},{0,1,2},{0,2,0},{0,2,1}});

TierMask.put("yrN",new int[][]{{0,0,0},{1,0,0},{0,1,1},{1,1,1},{0,2,2}});
TierMask.put("yrE",new int[][]{{0,0,0},{1,0,-1},{0,1,-1},{1,1,-2},{0,2,-2}});
TierMask.put("yrS",new int[][]{{0,0,0},{1,-1,-1},{1,0,0},{0,1,1},{1,1,1}});
TierMask.put("yrW",new int[][]{{0,0,0},{1,-1,0},{1,0,-1},{0,1,-1},{1,1,-2}});

TierMask.put("yRN",new int[][]{{0,0,0},{1,0,0},{2,-1,-1},{3,-1,-1},{4,-2,-2}});
TierMask.put("yRE",new int[][]{{0,0,0},{1,0,-1},{2,-1,-1},{3,-1,-2},{4,-2,-2}});
TierMask.put("yRS",new int[][]{{0,0,0},{1,-1,0},{2,-1,-1},{3,-2,-1},{4,-2,-2}});
TierMask.put("yRW",new int[][]{{0,0,0},{1,-1,-1},{2,-1,-1},{3,-2,-2},{4,-2,-2}});

//
//TierMask.get("aN"),以左上角为起点，四种方向下，每个方向的tier所占据的坐标(x,y)
/* TierMask.put("aN",new int[][]{{0,0},{0,1},{1,0},{1,1}});
TierMask.put("aE",new int[][]{{0,0},{0,1},{1,0},{1,1}});
TierMask.put("aS",new int[][]{{0,0},{0,1},{1,0},{1,1}});
TierMask.put("aW",new int[][]{{0,0},{0,1},{1,0},{1,1}});

TierMask.put("bN",new int[][]{{0,2},{1,0},{1,1},{1,2}});
TierMask.put("bE",new int[][]{{0,0},{1,0},{2,0},{2,1}});
TierMask.put("bS",new int[][]{{0,0},{0,1},{0,2},{1,0}});
TierMask.put("bW",new int[][]{{0,0},{0,1},{1,1},{2,1}});

TierMask.put("cN",new int[][]{{0,0},{0,1},{1,1},{1,2}});
TierMask.put("cE",new int[][]{{0,1},{1,0},{1,1},{2,0}});
TierMask.put("cS",new int[][]{{0,0},{0,1},{1,1},{1,2}});
TierMask.put("cW",new int[][]{{0,1},{1,0},{1,1},{2,0}});
//....
*/
   }
 
    public Tier(String type,String dir){
        this.type = type;
        this.dir = dir;
        this.pos = null;
    }
    public Tier(String tierStr){
        this.type = tierStr.substring(0,2);
        this.dir  = tierStr.substring(5,6);
        this.pos  = new int[]{Integer.parseInt(tierStr.substring(2,3)),
                             Integer.parseInt(tierStr.substring(3,4)),
                             Integer.parseInt(tierStr.substring(4,5))};
    }
    public Tier(String type,String dir,int[] pos){
        this.type = type;
        this.dir = dir;
        if (pos == null){
          this.pos = null;
        }else{
          this.pos = new int[3];
          this.pos[0] = pos[0];
          this.pos[1] = pos[1];
          this.pos[2] = pos[2];
        }
    }
    public void setPos(int[] pos){
        if (pos==null){
          this.pos = null;
        }else{
          this.pos = new int[3];
          this.pos[0]=pos[0];
          this.pos[1]=pos[1];
          this.pos[2] = pos[2];
        }
    }
    public int[] getPos(){
        if (this.pos==null){
            return null;
        }else{
            return new int[]{this.pos[0],this.pos[1],this.pos[2]};
        }
    }
    public String toString(){
        if (this.pos==null){
            return this.type+this.dir;
        }else{
            return this.type+this.pos[0]+this.pos[1]+this.pos[2]+this.dir;
        }
    }

    public Tier rotate(int z){
       if (this.dir.equals("N")){
          this.dir=(z==1)?"E":"W";
       }else if (this.dir.equals("E")){
          this.dir=(z==1)?"S":"N";
       }else if (this.dir.equals("S")){
          this.dir=(z==1)?"W":"E";
       }else if (this.dir.equals("W")){
          this.dir=(z==1)?"N":"S";           
       }else{
           System.out.println("error on "+this.type+","+this.dir);
       }
       return this;
    }
    public int[][] getLayout(){
        String key = this.type+this.dir;
        return TierMask.get(key);
    }
    public static int[][] getLayout(String key){
        return TierMask.get(key);
    }
    public String getGroupKey(){
        for ( Map.Entry<String,String[]> entry :this.group.entrySet()){
            if (Arrays.asList(entry.getValue()).contains(this.type))
                return entry.getKey();
        }
        return null;
    }
    public String[] getGroupValue(){
        String key = this.getGroupKey();
        if (key==null) return null;
        return this.group.get(key);
    }
}

System.out.println("Start Tier...");
Tier.init();
Tier test = new Tier("xb","N",new int[]{0,1,2});
test.rotate(1);
System.out.println(Arrays.deepToString(test.getLayout()));
test.rotate(1);
test.setPos(null);
System.out.println(Arrays.toString(test.getPos()));
System.out.println(Arrays.deepToString(Tier.getLayout("yfS")));
System.out.println(Arrays.toString(test.group.get("浅蓝")));
System.out.println(Arrays.toString(test.getGroupValue()));