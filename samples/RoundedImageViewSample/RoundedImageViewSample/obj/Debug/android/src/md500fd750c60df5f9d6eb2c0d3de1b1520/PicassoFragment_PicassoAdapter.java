package md500fd750c60df5f9d6eb2c0d3de1b1520;


public class PicassoFragment_PicassoAdapter
	extends android.widget.ArrayAdapter
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;:GetGetView_ILandroid_view_View_Landroid_view_ViewGroup_Handler\n" +
			"";
		mono.android.Runtime.register ("RoundedImageViewSample.PicassoFragment+PicassoAdapter, RoundedImageViewSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", PicassoFragment_PicassoAdapter.class, __md_methods);
	}


	public PicassoFragment_PicassoAdapter (android.content.Context p0, int p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == PicassoFragment_PicassoAdapter.class)
			mono.android.TypeManager.Activate ("RoundedImageViewSample.PicassoFragment+PicassoAdapter, RoundedImageViewSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1 });
	}


	public PicassoFragment_PicassoAdapter (android.content.Context p0, int p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == PicassoFragment_PicassoAdapter.class)
			mono.android.TypeManager.Activate ("RoundedImageViewSample.PicassoFragment+PicassoAdapter, RoundedImageViewSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public PicassoFragment_PicassoAdapter (android.content.Context p0, int p1, java.lang.Object[] p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == PicassoFragment_PicassoAdapter.class)
			mono.android.TypeManager.Activate ("RoundedImageViewSample.PicassoFragment+PicassoAdapter, RoundedImageViewSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:T[], Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public PicassoFragment_PicassoAdapter (android.content.Context p0, int p1, int p2, java.lang.Object[] p3) throws java.lang.Throwable
	{
		super (p0, p1, p2, p3);
		if (getClass () == PicassoFragment_PicassoAdapter.class)
			mono.android.TypeManager.Activate ("RoundedImageViewSample.PicassoFragment+PicassoAdapter, RoundedImageViewSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:T[], Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public PicassoFragment_PicassoAdapter (android.content.Context p0, int p1, java.util.List p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == PicassoFragment_PicassoAdapter.class)
			mono.android.TypeManager.Activate ("RoundedImageViewSample.PicassoFragment+PicassoAdapter, RoundedImageViewSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Collections.Generic.IList`1<T>, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public PicassoFragment_PicassoAdapter (android.content.Context p0, int p1, int p2, java.util.List p3) throws java.lang.Throwable
	{
		super (p0, p1, p2, p3);
		if (getClass () == PicassoFragment_PicassoAdapter.class)
			mono.android.TypeManager.Activate ("RoundedImageViewSample.PicassoFragment+PicassoAdapter, RoundedImageViewSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Collections.Generic.IList`1<T>, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public android.view.View getView (int p0, android.view.View p1, android.view.ViewGroup p2)
	{
		return n_getView (p0, p1, p2);
	}

	private native android.view.View n_getView (int p0, android.view.View p1, android.view.ViewGroup p2);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
