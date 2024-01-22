package ie.atu.robotpublish.Clients;

import feign.Headers;
import ie.atu.robotpublish.Models.SliderData;
import ie.atu.robotpublish.Services.SliderDataService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@FeignClient(name = "publish-service", url = "https://industrial.api.ubidots.com/api/v1.6/devices/robot/")
public interface PublishServiceClient {
    @PostMapping("")
    @Headers("X-Auth-Token: BBUS-R9TZ8sPj4ctPgpHE6HEOCIsvAwixSx")
//    @Headers("Content-Type: application/json")
    void publishSlider(@RequestBody SliderData sliderData);

}
