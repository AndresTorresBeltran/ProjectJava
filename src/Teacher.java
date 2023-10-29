public class Teacher extends school{
    private static final int PORCENTAJE1 = 100;
    private static final int PORCENTAJE2 = 110;

    private boolean fulltime;
    int hours;

    public boolean isFulltime() {

        return fulltime;
    }

    public int getHours() {
        return hours;
    }

    public int getYears() {
        return years;
    }

    int years;

    public Teacher(int id, String name, boolean fulltime, int hours, int years){
        super(id, name);
        this.fulltime=fulltime;
        this.hours=hours;
        this.years=years;

    }
    public double calcular_salario(){
        int porcentaje = 0;

        double total_salario=0;
        int anios_exp=0;

        if (fulltime== true) {
            porcentaje= PORCENTAJE1;
            anios_exp=years;
        }


        else{
            porcentaje= PORCENTAJE2;
        }// payment depend of the weekly hours in my model.
        total_salario= hours*total_salario*porcentaje/2;







        return total_salario;


    }



}
