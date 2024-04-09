package SEMSTEREXAM.basics;
@FunctionalInterface
interface abcd
{
void trying(int a);
}
public class lamdaexpress {
    public static void main(String[] args) {
        abcd obj=(a)->System.out.println(a);
        obj.trying(15);
        }
        
    }
