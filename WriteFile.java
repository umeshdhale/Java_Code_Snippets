import java.io.*;

class WriteFile
{
    public static void main(String arg[]) throws Exception
    {
        FileOutputStream fobj = new FileOutputStream("Expleo.txt");

        String Data = "Expleo Pune";

        byte bdata[] = Data.getBytes();

        fobj.write(bdata);
        fobj.close();
    }
}