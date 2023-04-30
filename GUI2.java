import java.awt.*;

class ExpleoFrame
{
    public ExpleoFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(500,500);
        fobj.setVisible(true);
    }
}

class GUI2
{
    public static void main(String arg[])
    {
        ExpleoFrame mobj = new ExpleoFrame("Expleo PPA41");
    }
}