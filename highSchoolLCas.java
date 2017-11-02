public class HighSchoolClass{
    private Student[] students;

    public Student getValedictorian(){
        String valedictorian = "";
        hold = 0;
        for(int i = 0; i < students.length;i++){
            if(students[i] > hold){
                valedictorian = students[i];
                hold = students[i].getGPA();
            }
            return valedictorian;
        }

    }
    public double getHonorsPercent(){
        int count = 0;
        for (int i = 0;i < students.length;i++){
            if(students[i].isHonors){
                count++
            }
        }
        return count/students.length;
    }


}