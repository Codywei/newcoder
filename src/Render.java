/**
 �����趨����̻�����

 ��һ����ɫ��Ļ������һά�����У����������ÿ��Ԫ�ش���������8λ�����ص�ֵ����ʵ��һ������������x����y������Ϳ����ɫ(���ر�Ŵ��㿪ʼ)�������Ծ���ʹ�����İ취��

 ������ʾ��Ļ������screen(�����е�ÿ��Ԫ�ش���������8�����أ��Ҵ������ҵ����طֱ��ӦԪ�صĶ����ƵĴӵ͵���λ)���Լ�int x,int y��������������������֤�������ݺϷ����뷵��Ϳɫ����µ���Ļ���顣

 �����д�����ֽⷨ������˼�붼�ǽ������������ʽ�е�x��yλ �� ��1������������ⷨ��˼·��ࡣ
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