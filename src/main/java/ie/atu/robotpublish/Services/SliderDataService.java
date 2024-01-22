package ie.atu.robotpublish.Services;

import ie.atu.robotpublish.Clients.PublishServiceClient;
import ie.atu.robotpublish.Models.SliderData;
import org.springframework.stereotype.Service;

@Service
public class SliderDataService {

    PublishServiceClient publishServiceClient;

    public SliderDataService(PublishServiceClient publishServiceClient){
        this.publishServiceClient = publishServiceClient;
    }

    public void publishSliderData(SliderData sliderData){
        System.out.println("Slider Data Service: "+ sliderData);
        publishServiceClient.publishSlider(sliderData);
    }
}
