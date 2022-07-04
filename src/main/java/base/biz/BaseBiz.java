package main.java.base.biz;

import main.java.base.data.entity.BaseTO;

import java.util.List;

public interface BaseBiz<T extends BaseTO> {
    public List<T> read(String className);

    public void save(T t);
    public void update(T t);
    public void delete(T t);
    public T get(T t, int id);
}
