package top.lixiaogang.pattern.iterator;

import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.iterator.impl.NameRepository;

/**
 * Created by lixiaogang on 2018/4/4.
 */
@Slf4j
public class testCase {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for(Iterator iter = nameRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            log.info("Name : " + name);
        }
    }
}
