System.out.println("Start...");
Tree tree = new Tree(new Tier("",""),null);
tree.ROW=10;
tree.COL=10;
tree.LEVEL=1;
tree.setBlankStat(true);
tree.setTierAll(new String[]{"xl","xz","xg","xy","xY","xf","xb",
             "xo","xO","xq","xQ","xc","xC","xh","xH","xw","xW","xr"});
//l00N, f20E, g02N, y06E, r07E, o12S, c14S, q30W, H32S, z33N, w60W, b80E
//System.out.print(tree.add(new Tier("xl000N")));
//System.out.print(tree.add(new Tier("xf020E")));
/*System.out.print(tree.add(new Tier("xg002N")));
System.out.print(tree.add(new Tier("xy006E")));
System.out.print(tree.add(new Tier("xr007E")));
System.out.print(tree.add(new Tier("xo012S")));
System.out.print(tree.add(new Tier("xc014S")));
System.out.print(tree.add(new Tier("xq030W")));
System.out.print(tree.add(new Tier("xH032S")));
System.out.print(tree.add(new Tier("xz033N")));
System.out.print(tree.add(new Tier("xw060W")));
*/
//60
//System.out.println(tree.add(new Tier("g00E")));
//System.out.println(tree.add(new Tier("Y01S")));
//54
//System.out.println(tree.add(new Tier("Y00E")));
//System.out.println(tree.add(new Tier("l11N")));
//44
//System.out.println(tree.add(new Tier("O00S")));
//System.out.println(tree.add(new Tier("C01N")));
//41
//System.out.println(tree.add(new Tier("0l000N")));
//System.out.println(tree.add(new Tier("0f020E")));
//System.out.println(tree.add(new Tier("O00S")));
//System.out.println(tree.add(new Tier("C01N")));
//48
//tree.setStartStat(new String[]{"xQ000W","xY001S"});
//51
//tree.setStartStat(new String[]{"xO000S","xY020N"});
//60
tree.setStartStat(new String[]{"xg000E","xY002S"});

//System.out.println(Arrays.deepToString(tree._stat));
System.out.println("");
for (int i=0;i<tree.LEVEL;i++){
  int[][] st = tree._stat.get("level"+i);
  if (st==null) continue;
  for (int j=0;j<tree.ROW - i;j++){
      System.out.println(Arrays.toString(st[j]));
  }
}
System.out.println("used:"+tree._used);
System.out.println("getVac:"+tree.getVac());

long startTime = System.currentTimeMillis();
tree.resolve(0);
long endTime = System.currentTimeMillis();
System.out.println("total time:"+(endTime-startTime)+" ms");
System.out.println(tree._used);
for (int i=0;i<tree.LEVEL;i++){
  int[][] st = tree._stat.get("level"+i);
  if (st==null) continue;
  for (int j=0;j<tree.ROW - i;j++){
      System.out.println(Arrays.toString(st[j]));
  }
}
