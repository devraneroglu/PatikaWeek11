package dev.patika.ecommerce.core.config.modelMapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// HER PROJEM BAŞLADIĞINDA BİR TANE MODEL MAPPER NESNESI URETIP Ioc Container içerisine at
@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
