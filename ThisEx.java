public class ThisEx 
{
    int x,y;
    void assign(int x, int y)
    {
        this.x=x;//refers to current object of class
        this.y=y;//refers to current object of class
    } 
    void add(ThisEx v)
    {
        System.out.println("Addition : "+(v.x+v.y));
    }
    void display()
    {   
        System.out.println("X and Y "+x+":"+y);
        add(this);
    }
    public static void main(String[] args) 
    {
        ThisEx t=new ThisEx();
        t.assign(15, 56);
        t.display();
        
    }
}
