@Bean
public class MOTService {
    private EmailService emailService;

    @AutoWired
    public MOTService(EmailService emailService) {
        this.emailService = emailService;
    }
}
