import com.alibaba.druid.sql.visitor.functions.Char;

public class IsNum {
    public static void main(String[] args) {
        String str = "编程词典2011上市了";
        char[] chars = str.toCharArray();
        String message = "字符串" + str + "中不包含数字";
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch > '0' && ch < '9') {
                message = "字符串" + str + "中包含数字";
                break;
            }
        }
        System.out.println(message);
    }


    public void IsNumber(String num){
        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch>'0' && ch<'9'){
                System.out.println("包含数字");
                break;
            }
        }
    }

    public void Isnumber(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch>'0' && ch<'9'){
                System.out.println("包含数字");
                break;
            }
        }
    }

    public void IsMmm(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch>'0' && ch<'9'){
                System.out.println("包含数字");
                break;
            }
        }
    }

}
