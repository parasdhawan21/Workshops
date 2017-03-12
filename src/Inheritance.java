/**
 * Created by PARAS on 12-03-2017.
 */
public class Inheritance {

    public static void main(String[] args) {


        Fruits f1=new Orange();



        f1.setName("Orange");
        f1.setColor("Orange");

        f1.showName();
        f1.showColor();


        f1=new Mango();


        f1.setName("Mango");
        f1.setColor("Yellow");

        f1.showName();
        f1.showColor();


    }


}



    class Orange extends Fruits
        {


            @Override
            public void showColor() {
                super.showColor();
                System.out.println("Overriding : The orange has same name as its color.");
            }
        }



class Mango extends Fruits
{


    @Override
    public void showColor() {
        super.showColor();
        System.out.println("Overriding : The Mango is king of fruits.");
    }
}


class Fruits
{
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    Fruits()
    {
        color="";
        name="";
    }

    public void showName()
    {
        System.out.println("Name of fruit : " + name);
    }

    public void showColor()
    {
        System.out.println("Color of fruit : " + color);
    }
}


