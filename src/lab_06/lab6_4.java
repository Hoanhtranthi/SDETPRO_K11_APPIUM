package lab_06;

public class lab6_4 {
    public static void main(String[] args) {
        String url = "https://google.com";
        checkPrococol(url);
        checkDomain(url);
    }
    public static void checkPrococol(String url){
        String HTTPS_Prococol = "https";
        String HTTP_Prococol = "http";
        int indexOfptc = url.indexOf(":");
        String protocol = url.substring(0,indexOfptc);

        if (protocol.equals(HTTPS_Prococol))
        {
            System.out.println("Protocol is " +  HTTPS_Prococol);
        } else if (protocol.equals(HTTP_Prococol)) {
            System.out.println("Protocol is " +  HTTPS_Prococol);
        } else {
            System.out.println("This is unknown protocol");
        }
    }
    public static void checkDomain(String url){
        String com = ".com";
        String net = ".net";
        int indexOfptc = url.indexOf(".");
        String domain = url.substring(indexOfptc,url.length());
        if (domain.equals(com))
        {
            System.out.println("Domain is " +  com);
        } else if (domain.equals(net)) {
            System.out.println("Domain is " +  net);
        } else {
            System.out.println("This is unknown domain");
        }
    }

}

