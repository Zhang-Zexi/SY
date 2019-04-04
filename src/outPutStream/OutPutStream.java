package outPutStream;

import com.sun.imageio.plugins.common.ImageUtil;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @ClassName OutPutStream
 * @Description
 * @Author zhangzx
 * @Date 2019/4/4 15:38
 * Version 1.0
 **/
public class OutPutStream {

//    public void getIcon(HttpServletRequest request, HttpServletResponse response) throws IOException {
//
//        response.setContentType("image/png");
//        OutputStream stream = null;
//        try{
//            stream = response.getOutputStream();
//            ImageUtil.setImage(stream, "信用卡部" + OrganizationContextHolder.getUserName() +
//                    OrganizationContextHolder.getUserNo(), "png");
//            stream.flush();
//        }catch(Exception e){
//            logger.info("人行征信报告添加水印异常");
//            throw new ProcessException("人行征信报告添加水印异常");
//        }finally{
//            stream.close();
//            logger.info("开始生成人行征信报告水印信息结束");
//        }
//
//    }
}
