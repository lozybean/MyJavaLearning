package Chapter10;
class WithInner{
	class Inner{}
}

public class InheritInner extends WithInner.Inner {
	InheritInner(WithInner wi){
		wi.super();
	}
}
