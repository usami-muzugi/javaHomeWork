public class IfDemo {
        /*
            if ѡ��ṹ
                1.�﷨����
                if(boolean���͵�ֵ�����ʽ������������){
                    //����ִ�����
                }


                if(){

                }else if(){

                }else if(){

                }else if(){

                }
         */
        public static void main(String[] args) {
            int sex = 0; //�Ա��ʾ
            if (sex == 0) { //(��������boolean���͵�ֵ�����ʽ������)
                //����ִ�����
                System.out.println("�в���");
            }
            //������ѡ��ṹ�������⣡
            if (sex == 1) {
                System.out.println("Ů����");
            }
            if (sex == 2) {
                System.out.println("�ݴԲ���");
            }
            if (sex == 4) {
                System.out.println("û����");
            } else {
            }


            //�ṹ�໥���Ƕ����ģ�����
            if (sex == 0) {
                System.out.println("�в���");
            } else if (sex == 1) {
                System.out.println("Ů����");
            } else if (sex == 2) {
                System.out.println("�ݴԲ���");
            } else {
                //sex ==4
                System.out.println("û����");
            }

            if (sex == 0) {
                System.out.println("�в���");
            } else {
                System.out.println("��������");
            }

            if (sex == 1) {
                System.out.println(sex);
            } else {
                System.out.println(2);
            } /*else if ()   //else if with out if��  else if ��if��Ҫ����else���ṹ��֮ǰ
        }*/


            //������������������Ū�������ֵ
            int a  = 10;
            int b  = 14;
            if(a > b){
                System.out.println(a + ">" + b);
            }else if (a < b){
                System.out.println(a + "<" + b);
            }else{
                System.out.println(a + "=" + b);
            }

            //�ж�һ�����Ƿ���3�ı���
            int var = 4399;
            if(var % 3 ==0){
                System.out.println("�����"+var+"��3�ı���");
            }else{
                System.out.println("�����"+var+"����3�ı���");
            }


            //С��JAVA���Գɼ������ȼ���ΪA B C D���жϱ����ڲ�ͬ�ķ�Χ�ģ���ӡ�����ͬ�ĵȼ�
            int score = 66;
            if(score < 60){
                System.out.println("�ɼ������� E");
            }else if (score>=60&score<70){
                System.out.println("�ɼ����� D");
            }else if(score>=70&score<80){
                System.out.println("�ɼ����� C");
            }else if(score>=80&score<90){
                System.out.println("�ɼ����� B");
            }else{
                System.out.println("�ɼ����� A");
            }
        }
}