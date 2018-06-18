/**
 像素设定（编程基础）

 有一个单色屏幕储存在一维数组中，其中数组的每个元素代表连续的8位的像素的值，请实现一个函数，将第x到第y个像素涂上颜色(像素标号从零开始)，并尝试尽量使用最快的办法。

 给定表示屏幕的数组screen(数组中的每个元素代表连续的8个像素，且从左至右的像素分别对应元素的二进制的从低到高位)，以及int x,int y，意义如题意所述，保证输入数据合法。请返回涂色后的新的屏幕数组。

 这道题写了两种解法，基本思想都是将数组二进制形式中的x到y位 与 “1”作或操作。解法二思路简洁。
 * */
public class Render {
    public static int[] renderPixel1(int[] screen, int x, int y) {
          StringBuffer sb =new StringBuffer();
          int model=0;
          for(int i=0;i<=y;i++){
              if(i<x){
                  sb.append('0');
              }
              else{
                  sb.append('1');
              }
              if((sb.length()==8)||(i==y)){
                  while(sb.length()!=8){
                      sb.append('0');
                  }
                  for(int j=0;j<sb.length();j++){
                      if(sb.charAt(j)!='0') {
                          model+= Math.pow(2, j);
                      }
                  }
                  screen[i/8]=screen[i/8]|model;
                  sb.delete(0,8);
                  model=0;
              }
          }
       return screen;

    }
    public static int[] renderPixel2(int[] screen, int x, int y) {
        for(int i = x ; i <= y ; i ++)
        {
            int k = i % 8 ;
            int t = i / 8 ;
            screen[t] = screen[t] | (1<< k);
        }

        return screen;

    }
    public static void main(String[]args){
        int [] sreen={0,0};
//      int [] result=renderPixel1(sreen,0,14);
        int [] result1=renderPixel2(sreen,0,14);
        for(int i=0;i<result1.length;i++){
            System.out.println(result1[i]);
        }

    }
}