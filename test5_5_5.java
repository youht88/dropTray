System.out.println("Start...");
Tree tree = new Tree(new Tier("",""),null);
tree.ROW=5;
tree.COL=5;
tree.LEVEL=5;
tree.setBlankStat(false);
tree.setTierAll(new String[]{"xl","yl",
                             "xz","yz",
                             "xg","yg",
                             "xy","xY","yy","yY","yu","yU",
                             "xf","yf","yF","ym",
                             "xb","yb","yB",
                             "xo","xO","yo","yO","yt","yT",
                             "xq","xQ","yq","yQ","yk","yK",
                             "xc","xC",
                             "xh","xH","yh","yH","yp","yP",
                             "xw","yw","yW",
                             "xr","yr","yR"
                             });
//sample1
//tree.setStartStat(new String[]{"xH013S", "xC031E", "xY100S", "xz110N", "xw112S", "xo200E", "xl211N", "xb300S", "xr000S", "xf002S", "xq010E", "yg130S"});
tree.setStartStat(new String[]{"xf000E"});
//[xH013S, xg000E, xc001S, xo003S, yz021N, xq030N, xl100N, xY102W, yB112S, xw120W, yf200N, yr202E]

//sample 2
//tree.setStartStat(new String[]{"xY000S", "xr010E", "xq030N", "xO022E", "xC003N","xw100N", "xl102N", "xH120E", "yg044W", "yb111N", "xz200N", "yf202E"});
//No.1
//tree.setStartStat(new String[]{"xq000S","xC010E","xl030N","xw032W","xo100N","xh003S","xf200N","yr101N","yu103E","yB013W","yz111N","xg130N"});
//No.2
//tree.setStartStat(new String[]{"xy000S","xl010N","xg004E","xC030E","xf100E"});
//No.3
//tree.setStartStat(new String[]{"xC000W","xl003N","xb023E","xQ010W","xy100S"});
//No.4??
//tree.setStartStat(new String[]{"xf000E","xH001E","xC013N","yB021E","xY100S"});//
//No.5
//tree.setStartStat(new String[]{"xb000S","xo002E","xc012W","xQ010W","xy100S"});
//No.6
//tree.setStartStat(new String[]{"xr000S","xC002W","xl023N","xQ010W","xy100S"
//                              ,"xw110E","xg041N"});

System.out.println("");
tree.printStat();
System.out.println("used:"+tree._used);
System.out.println("getVac:"+tree.getVac());

long startTime = System.currentTimeMillis();
tree.resolve(0);
long endTime = System.currentTimeMillis();
System.out.println("total time:"+(endTime-startTime)+" ms");
System.out.println(tree._used);
tree.printStat();