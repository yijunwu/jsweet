package def.dom;

@jsweet.lang.Extends({SVGStylable.class,SVGTransformable.class,SVGTests.class,SVGLangSpace.class,SVGExternalResourcesRequired.class})
public class SVGRectElement extends SVGElement {
    public SVGAnimatedLength height;
    public SVGAnimatedLength rx;
    public SVGAnimatedLength ry;
    public SVGAnimatedLength width;
    public SVGAnimatedLength x;
    public SVGAnimatedLength y;
    native public void addEventListener(java.lang.String type, EventListener listener, java.lang.Boolean useCapture);
    public static SVGRectElement prototype;
    public SVGRectElement(){}
    public SVGAnimatedString className;
    public CSSStyleDeclaration style;
    public SVGAnimatedTransformList transform;
    public SVGStringList requiredExtensions;
    public SVGStringList requiredFeatures;
    public SVGStringList systemLanguage;
    native public java.lang.Boolean hasExtension(java.lang.String extension);
    public java.lang.String xmllang;
    public java.lang.String xmlspace;
    public SVGAnimatedBoolean externalResourcesRequired;
    native public void addEventListener(java.lang.String type, EventListener listener);
    native public void addEventListener(java.lang.String type, EventListenerObject listener, java.lang.Boolean useCapture);
    native public void addEventListener(java.lang.String type, EventListenerObject listener);
}

