package chemicalcompounds;

import chemicalcompounds.view.MainFrame;

import java.awt.*;


public class Main {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        ChemicalsService chemicalsService = context.getBean("chemicalsServiceImpl", ChemicalsService.class);
    }
}
