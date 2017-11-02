public class Code{

    Private String myCode;
    Private String coded = "";

    public Code(String code){
        myCode = code;
    }
    public string getCode(){
        return coded;
    }
    public void hide(int p1, int p2){
        for(int i = 0;i < myCode.length();i++)
        if(i>=p1 && i < p2){
            coded += "x";
        }
        else{
            coded += myCode.substring(i, i+1);
        }
    }
    public void recover (int p1, int p2){
        coded = ""
        for(int i = 0;i < myCode.length();i++)
            if(i>=p1 && i < p2){
                coded += mycode.substring(i, i+1);
            }
            else{
                coded += myCode.substring(i, i+1);
            }
    }
}