package xgen.generator.pp;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import xgen.parsetree.Leaf;
import xgen.parsetree.Pair;
import xgen.postprocess.TransformAll;

@SuppressWarnings("all")
public class NameStates extends TransformAll<Object,Set<String>,Set<String>> {
  protected Set<String> finalizeCarrier(final Set<String> c) {
    return c;
  }
  
  protected Set<String> supplyCarrier(final Object s) {
    HashSet<String> _newHashSet = CollectionLiterals.<String>newHashSet();
    return _newHashSet;
  }
  
  protected Pair<Set<String>,Leaf> transformOneLeaf(final Pair<Set<String>,Leaf> p) {
    boolean _notEquals = (!Objects.equal(p.b.value, "<state name>"));
    if (_notEquals) {
      return p;
    }
    int _size = p.a.size();
    final String nsn = ("State" + Integer.valueOf(_size));
    Set<String> _singleton = Collections.<String>singleton(nsn);
    SetView<String> _union = Sets.<String>union(p.a, _singleton);
    Leaf _leaf = new Leaf(p.b.label, nsn);
    return Pair.<Set<String>, Leaf>create(_union, _leaf);
  }
}
