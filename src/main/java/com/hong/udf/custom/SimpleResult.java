package com.hong.udf.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Description     :
 */
public class SimpleResult implements Collection<List<ResultEntry>> {

	private final List<List<ResultEntry>> entries = new ArrayList<>(0);

	@Override
	public int size() {
		return entries.size();
	}

	@Override
	public boolean isEmpty() {
		return entries.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return entries.contains(o);
	}

	@Override
	public Iterator<List<ResultEntry>> iterator() {
		return entries.iterator();
	}


	@Override
	public Object[] toArray() {
		return entries.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return entries.toArray(a);
	}

	@Override
	public boolean add(List<ResultEntry> resultEntries) {
		return entries.add(resultEntries);
	}


	@Override
	public boolean remove(Object o) {
		return entries.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return entries.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends List<ResultEntry>> c) {
		return entries.addAll(c);
	}


	@Override
	public boolean removeAll(Collection<?> c) {
		return entries.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return entries.retainAll(c);
	}

	@Override
	public void clear() {
		entries.clear();
	}
}
