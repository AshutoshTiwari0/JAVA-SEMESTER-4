
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.Annotation;



//meta annotaions
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
@Documented
@Inherited
@interface smartphone //marker interface->no value interface
{
    String os();
    int version();
}

//we made our own annotaion 
//smarthphone with featuresbos and verison
// so our class nokia is a phome if it has an aos and version
//since it has these two we can it is a smartphone

@smartphone(os="Android",version=6)
class NOKIA
{
    String model;
    int screensize;

    public NOKIA(String model, int screensize) {
        this.model = model;
        this.screensize = screensize;
    }
    
}


public class custom {
    public static void main(String args[])
    {
         /*dirt
         * d->documented
         * i->inherited
         * r->retention
         * t->target
         */
        NOKIA obj=new NOKIA("Lumia A",45 );
        System.out.println(obj.model);

        Class c=obj.getClass();
        java.lang.annotation.Annotation an=c.getAnnotation(smartphone.class);
        smartphone s=(smartphone)an;
        System.out.println(s.os());

    }
}

