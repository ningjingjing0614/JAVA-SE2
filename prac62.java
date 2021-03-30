package pack16;

public class prac62 implements Comparable<prac62> {
    String name;
    int height;
    String gender;
    int score;


    @Override
    public int compareTo(prac62 o) {
        int thisGender;
        int oGender;
        if (this.gender.equals("男")){
            thisGender = 1;
        }else {
            thisGender = 0;
        }
        if (o.gender.equals("男")){
            oGender = 1;
        }else {
            oGender = 0;
        }
        if (thisGender < oGender){
            return -1;
        }else if (thisGender > oGender){
            return 1;
        }else {
            return 0;
        }
    }
}
