package rop.request;

import rop.converter.RopConverter;

/**
 *  将以BASE64位编码字符串转换为字节数组的{@link UploadFile}对象
 */
public class UploadFileConverter implements RopConverter<UploadFile> {

    @Override
    public UploadFile convertToObject(String source) {
        String fileName = UploadFileUtils.getFileName(source);
        byte[] contentBytes = UploadFileUtils.decode(source);
        return new UploadFile(fileName, contentBytes);
    }

    @Override
    public String convertToString(UploadFile file) {
        return UploadFileUtils.encode(file);
    }

	@Override
	public Class<UploadFile> getSupportClass() {
		return UploadFile.class;
	}
}

