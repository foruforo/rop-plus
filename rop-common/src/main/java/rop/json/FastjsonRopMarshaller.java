package rop.json;

import rop.RopMarshaller;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * JSON 序列化
 * Created by luopeng on 14-3-27.
 */
public class FastjsonRopMarshaller implements RopMarshaller {

	@Override
	public String marshaller(Object object) {
        return JSON.toJSONStringWithDateFormat(object,JSON.DEFFAULT_DATE_FORMAT,SerializerFeature.DisableCircularReferenceDetect);
//		return JSON.toJSONString(object,SerializerFeature.DisableCircularReferenceDetect);
	}
}
