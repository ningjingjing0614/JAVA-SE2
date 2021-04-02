package pack19;

public class studentPrac72 implements Comparable<studentPrac72> {
    String name;
    int height;
    String gender;

    @Override
    public int compareTo(studentPrac72 o) {
        int num1, num2;
        if (o.gender.equals("男")){
            num1 = 0;
        }else{
            num2 = 1;
        }
        if (this.gender.equals("女")){
            if (o.gender.equals("女")){
                return 0;
            }else if(o.gender.equals("男")){
                return 1;
            }
        }

    }


}
