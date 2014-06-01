package xgen.generator.pp;

import com.google.common.base.Objects;
import xgen.parsetree.Leaf;
import xgen.parsetree.Node;
import xgen.parsetree.Pair;
import xgen.postprocess.RemoveAll;

@SuppressWarnings("all")
public class RemoveRemainingInitials extends RemoveAll<Object,Object> {
  protected boolean remove(final Leaf leaf) {
    boolean _equals = Objects.equal(leaf.value, "<initial>");
    return _equals;
  }
  
  protected Pair<Object,Node> transformState(final Pair<Object,Node> n) {
    return n;
  }
}
