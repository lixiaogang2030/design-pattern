package top.lixiaogang.pattern.iterator.impl;

import top.lixiaogang.pattern.iterator.Container;
import top.lixiaogang.pattern.iterator.Iterator;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class NameRepository implements Container{

    public String names[] = {"lxg", "wyf", "cza"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
