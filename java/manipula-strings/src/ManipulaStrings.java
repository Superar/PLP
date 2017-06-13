class ManipulaStrings
{
    private String s1;
    private String s2;
    private String s3;

    ManipulaStrings()
    {
        s1 = "branco";
        s2 = "azul";
        s3 = "bonito";
    }

    String manipula1(String s)
    {
        if(s.startsWith("a"))
        {
            return s + s1;
        }
        else if (s.startsWith("b"))
        {
            return s + s2;
        }
        else if (s.startsWith("c"))
        {
            return s + s3;
        }
        else
        {
            return s;
        }
    }


    int manipula2(String s)
    {
        int count = 0;

        while(s.contains(s1))
        {
            s = s.replaceFirst(s1, "");
            count++;
        }
        while(s.contains(s2))
        {
            s = s.replaceFirst(s2, "");
            count++;
        }
        while(s.contains(s3))
        {
            s = s.replaceFirst(s3, "");
            count++;
        }

        return count;
    }


    int conta_char(char a, String s)
    {
        int count = 0;
        while(s.contains("" + a))
        {
            s = s.replaceFirst("" + a, "");
            count ++;
        }

        return count;
    }

    String elimina_char(char a, String s)
    {
        return s.replace(a, (char)0);
    }
}
