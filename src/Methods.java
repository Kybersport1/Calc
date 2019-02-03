public class Methods extends  Variables{
    public  Methods(float first , float second , char simvol){
        super( first , second , simvol);
        if(simvol == '+'){
            sum();
        }else if(simvol == '-'){
            subtraction();
        }else if(simvol =='/') {
            division();
        }else if(simvol=='*'){
            multiplication();
        }
    }

    public void sum (){
        float result = super.firstinteger + super.secondinteger;
        System.out.println(result);
    }

    public void subtraction (){
        float result = super.firstinteger - super.secondinteger;
        System.out.println(result);
    }

    public void division (){
        float result = super.firstinteger / super.secondinteger;
        System.out.println(result);    }

    public void multiplication (){
        float result = super.firstinteger * super.secondinteger;
        System.out.println(result);
    }
}
