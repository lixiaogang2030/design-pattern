package top.lixiaogang.pattern.proxy;

import top.lixiaogang.pattern.proxy.impl.RealImage;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void disPlay() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.disPlay();
    }
}
