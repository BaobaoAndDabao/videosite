package client.video.web;

import com.video.site.client.vo.VideoVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/video")
public class VideoController {

    @RequestMapping("/getVideoDetail/pojo")
    public VideoVO hello(VideoVO videoVO){
        videoVO.setId("111");
        return videoVO;
    }

}
