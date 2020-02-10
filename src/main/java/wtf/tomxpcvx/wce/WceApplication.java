package wtf.tomxpcvx.wce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import wtf.tomxpcvx.wce.services.IWaMessageService;


@SpringBootApplication
public class WceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(WceApplication.class, args);

        IWaMessageService waMessageService =  ctx.getBean("waMessageService", IWaMessageService.class);

        System.out.println(waMessageService.getAllWaMessages().get(196295));
    }

    @Override
    public void run(String... strings) throws Exception {}
}