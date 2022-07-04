package main.java.base.biz;

import main.java.base.data.entity.BaseTO;
import main.java.base.data.factory.BaseFactory;

import java.util.List;

public class BaseBizImpl<T extends BaseTO> implements BaseBiz<T> {
    private static  BaseFactory factory = new BaseFactory();

    @Override
    public List<T> read(String className) {
        List<T> list = factory.read(className);
        return list;
    }

    @Override
    public void save(T t) {
        factory.save(t);
    }

    @Override
    public void update(T t) {
        factory.update(t);

    }


    @Override
    public void delete(T t) {
        factory.delete(t);
    }

    @Override
    public T get(T t, int id) {
        return (T) factory.get(t, id);
    }
}