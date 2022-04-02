package singelton;

public class Logger {
    private static Logger log;

    private Logger(){

    }
    public static synchronized Logger getInstance(){
        if(log== null){
            log = new Logger();
        }
        return log;
    }


}
