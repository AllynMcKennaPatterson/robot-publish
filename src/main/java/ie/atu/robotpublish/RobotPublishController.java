package ie.atu.robotpublish;

import ie.atu.robotpublish.Models.SliderData;
import ie.atu.robotpublish.Services.SliderDataService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotPublishController {
    SliderDataService sliderDataService;

    public RobotPublishController(SliderDataService sliderDataService){
        this.sliderDataService = sliderDataService;
    }

    @PostMapping("/publish-slider")
    public void publishSlider(@RequestBody SliderData sliderData) {
        System.out.println("Publishing Slider data: " + sliderData);

        sliderDataService.publishSliderData(sliderData);
    }

}
