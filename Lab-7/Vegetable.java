abstract class Veg
{
    String color;
    String vegName;
    abstract public String toString();
}
    class Potato extends Veg
    {
        Potato(String C)
        {
            super.color=C;
            super.vegName="Potato";
        }
        public String toString()
        {
            return "Veg_Name = "+super.vegName+"; Color = "+color;
        }
    }
    class Tomato extends Veg
    {
        Tomato(String C)
        {
            super.color=C;
            super.vegName="Tomato";
        }
        public String toString()
        {
            return "Veg_Name = "+super.vegName+"; Color = "+color;
        }
    }
    class Brinjal extends Veg
    {
        Brinjal(String C)
        {
            super.color=C;
            super.vegName="Brinjal";
        }
        public String toString()
        {
            return "Veg_Name = "+super.vegName+"; Color = "+color;
        }
    }

public class Vegetable 
{
    public static void main(String[] args) 
    {
       Potato p = new Potato("Brown");
       System.out.println(p); 

       Tomato t = new Tomato("Red");
       System.out.println(t); 

       Brinjal b = new Brinjal("Purple");
       System.out.println(b);
    }    
}
