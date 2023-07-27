package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        String[] a={"AHMET","MEHT"};
        String[] b={"FULL","PARTIALLY"};
 Company co=new Company(12,"MCG",25,a);
 System.out.println(co.toString());
 Healthplan he=new Healthplan(26,"MCGSİGORTA",Plan.PARTİALLY);
 System.out.println(he.toString());
 Employee em=new Employee(12,"ahmet yılmaz","ahmet.gmail.com","12345678",b);
        System.out.println(em.toString());




    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
