/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @Marshaler(NSString.AsStringMarshaler.class)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIKit/*</name>*/ 
    extends /*<extends>*/Object/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(UIKit.class); }/*</bind>*/
    /*<constants>*/
    public static final int SegmentedControlNoSegment = -1;
    public static final int AttachmentCharacter = 65532;
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIKeyInputUpArrow", optional=true)
    public static native String KeyInputUpArrow();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIKeyInputDownArrow", optional=true)
    public static native String KeyInputDownArrow();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIKeyInputLeftArrow", optional=true)
    public static native String KeyInputLeftArrow();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIKeyInputRightArrow", optional=true)
    public static native String KeyInputRightArrow();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIKeyInputEscape", optional=true)
    public static native String KeyInputEscape();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorFamilyAttribute", optional=true)
    public static native NSString FontDescriptorFamilyAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorNameAttribute", optional=true)
    public static native NSString FontDescriptorNameAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorFaceAttribute", optional=true)
    public static native NSString FontDescriptorFaceAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorSizeAttribute", optional=true)
    public static native NSString FontDescriptorSizeAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorVisibleNameAttribute", optional=true)
    public static native NSString FontDescriptorVisibleNameAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorMatrixAttribute", optional=true)
    public static native NSString FontDescriptorMatrixAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorCharacterSetAttribute", optional=true)
    public static native NSString FontDescriptorCharacterSetAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorCascadeListAttribute", optional=true)
    public static native NSString FontDescriptorCascadeListAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorTraitsAttribute", optional=true)
    public static native NSString FontDescriptorTraitsAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorFixedAdvanceAttribute", optional=true)
    public static native NSString FontDescriptorFixedAdvanceAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorFeatureSettingsAttribute", optional=true)
    public static native NSString FontDescriptorFeatureSettingsAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorTextStyleAttribute", optional=true)
    public static native NSString FontDescriptorTextStyleAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontSymbolicTrait", optional=true)
    public static native NSString FontSymbolicTrait();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontWeightTrait", optional=true)
    public static native NSString FontWeightTrait();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontWidthTrait", optional=true)
    public static native NSString FontWidthTrait();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontSlantTrait", optional=true)
    public static native NSString FontSlantTrait();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontFeatureTypeIdentifierKey", optional=true)
    public static native NSString FontFeatureTypeIdentifierKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontFeatureSelectorIdentifierKey", optional=true)
    public static native NSString FontFeatureSelectorIdentifierKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontTextStyleHeadline", optional=true)
    public static native String FontTextStyleHeadline();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontTextStyleBody", optional=true)
    public static native String FontTextStyleBody();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontTextStyleSubheadline", optional=true)
    public static native String FontTextStyleSubheadline();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontTextStyleFootnote", optional=true)
    public static native String FontTextStyleFootnote();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontTextStyleCaption1", optional=true)
    public static native String FontTextStyleCaption1();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontTextStyleCaption2", optional=true)
    public static native String FontTextStyleCaption2();
    @GlobalValue(symbol="UIEdgeInsetsZero", optional=true)
    public static native @ByVal UIEdgeInsets EdgeInsetsZero();
    @GlobalValue(symbol="UIOffsetZero", optional=true)
    public static native @ByVal UIOffset OffsetZero();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="UIViewNoIntrinsicMetric", optional=true)
    public static native @MachineSizedFloat double ViewNoIntrinsicMetric();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="UILayoutFittingCompressedSize", optional=true)
    public static native @ByVal CGSize LayoutFittingCompressedSize();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="UILayoutFittingExpandedSize", optional=true)
    public static native @ByVal CGSize LayoutFittingExpandedSize();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="UIScrollViewDecelerationRateNormal", optional=true)
    public static native @MachineSizedFloat double ScrollViewDecelerationRateNormal();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="UIScrollViewDecelerationRateFast", optional=true)
    public static native @MachineSizedFloat double ScrollViewDecelerationRateFast();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSTabColumnTerminatorsAttributeName", optional=true)
    public static native NSString TabColumnTerminatorsAttributeName();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalValue(symbol="UITextAttributeFont", optional=true)
    public static native NSString TextAttributeFont();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalValue(symbol="UITextAttributeTextColor", optional=true)
    public static native NSString TextAttributeTextColor();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalValue(symbol="UITextAttributeTextShadowColor", optional=true)
    public static native NSString TextAttributeTextShadowColor();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalValue(symbol="UITextAttributeTextShadowOffset", optional=true)
    public static native NSString TextAttributeTextShadowOffset();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="UITableViewIndexSearch", optional=true)
    public static native NSString TableViewIndexSearch();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalValue(symbol="UITableViewAutomaticDimension", optional=true)
    public static native @MachineSizedFloat double TableViewAutomaticDimension();
    @GlobalValue(symbol="UITableViewSelectionDidChangeNotification", optional=true)
    public static native String Value__UITableViewSelectionDidChangeNotification();
    @GlobalValue(symbol="UIAccessibilityTraitKeyboardKey", optional=true)
    public static native NSString AccessibilityTraitKeyboardKey();
    @GlobalValue(symbol="UIAccessibilityTraitKeyboardKey", optional=true)
    public static native void AccessibilityTraitKeyboardKey(NSString v);
    @GlobalValue(symbol="UIAccessibilityScreenChangedNotification", optional=true)
    public static native int Value__UIAccessibilityScreenChangedNotification();
    @GlobalValue(symbol="UIAccessibilityScreenChangedNotification", optional=true)
    public static native void Value__UIAccessibilityScreenChangedNotification(int v);
    @GlobalValue(symbol="UIAccessibilityLayoutChangedNotification", optional=true)
    public static native int Value__UIAccessibilityLayoutChangedNotification();
    @GlobalValue(symbol="UIAccessibilityLayoutChangedNotification", optional=true)
    public static native void Value__UIAccessibilityLayoutChangedNotification(int v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityAnnouncementNotification", optional=true)
    public static native int Value__UIAccessibilityAnnouncementNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityAnnouncementNotification", optional=true)
    public static native void Value__UIAccessibilityAnnouncementNotification(int v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityAnnouncementDidFinishNotification", optional=true)
    public static native String Value__UIAccessibilityAnnouncementDidFinishNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityAnnouncementKeyStringValue", optional=true)
    public static native NSString AccessibilityAnnouncementKeyStringValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityAnnouncementKeyWasSuccessful", optional=true)
    public static native NSString AccessibilityAnnouncementKeyWasSuccessful();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalValue(symbol="UIAccessibilityPageScrolledNotification", optional=true)
    public static native int Value__UIAccessibilityPageScrolledNotification();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalValue(symbol="UIAccessibilityPageScrolledNotification", optional=true)
    public static native void Value__UIAccessibilityPageScrolledNotification(int v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilitySpeechAttributePunctuation", optional=true)
    public static native NSString AccessibilitySpeechAttributePunctuation();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilitySpeechAttributeLanguage", optional=true)
    public static native NSString AccessibilitySpeechAttributeLanguage();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilitySpeechAttributePitch", optional=true)
    public static native NSString AccessibilitySpeechAttributePitch();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityVoiceOverStatusChanged", optional=true)
    public static native NSString AccessibilityVoiceOverStatusChanged();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityMonoAudioStatusDidChangeNotification", optional=true)
    public static native String Value__UIAccessibilityMonoAudioStatusDidChangeNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityClosedCaptioningStatusDidChangeNotification", optional=true)
    public static native String Value__UIAccessibilityClosedCaptioningStatusDidChangeNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityInvertColorsStatusDidChangeNotification", optional=true)
    public static native String Value__UIAccessibilityInvertColorsStatusDidChangeNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityGuidedAccessStatusDidChangeNotification", optional=true)
    public static native String Value__UIAccessibilityGuidedAccessStatusDidChangeNotification();
    @GlobalValue(symbol="UIDeviceOrientationDidChangeNotification", optional=true)
    public static native String Value__UIDeviceOrientationDidChangeNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="UIDeviceBatteryStateDidChangeNotification", optional=true)
    public static native String Value__UIDeviceBatteryStateDidChangeNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="UIDeviceBatteryLevelDidChangeNotification", optional=true)
    public static native String Value__UIDeviceBatteryLevelDidChangeNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="UIDeviceProximityStateDidChangeNotification", optional=true)
    public static native String Value__UIDeviceProximityStateDidChangeNotification();
    @GlobalValue(symbol="UITextInputTextBackgroundColorKey", optional=true)
    public static native NSString TextInputTextBackgroundColorKey();
    @GlobalValue(symbol="UITextInputTextColorKey", optional=true)
    public static native NSString TextInputTextColorKey();
    @GlobalValue(symbol="UITextInputTextFontKey", optional=true)
    public static native NSString TextInputTextFontKey();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalValue(symbol="UITextInputCurrentInputModeDidChangeNotification", optional=true)
    public static native String Value__UITextInputCurrentInputModeDidChangeNotification();
    @GlobalValue(symbol="UITextFieldTextDidBeginEditingNotification", optional=true)
    public static native String Value__UITextFieldTextDidBeginEditingNotification();
    @GlobalValue(symbol="UITextFieldTextDidEndEditingNotification", optional=true)
    public static native String Value__UITextFieldTextDidEndEditingNotification();
    @GlobalValue(symbol="UITextFieldTextDidChangeNotification", optional=true)
    public static native String Value__UITextFieldTextDidChangeNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalValue(symbol="UIBackgroundTaskInvalid", optional=true)
    public static native @MachineSizedUInt long BackgroundTaskInvalid();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalValue(symbol="UIMinimumKeepAliveTimeout", optional=true)
    public static native double MinimumKeepAliveTimeout();
    @GlobalValue(symbol="UITrackingRunLoopMode", optional=true)
    public static native String TrackingRunLoopMode();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="UIStateRestorationViewControllerStoryboardKey", optional=true)
    public static native NSString StateRestorationViewControllerStoryboardKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="UIApplicationStateRestorationBundleVersionKey", optional=true)
    public static native NSString ApplicationStateRestorationBundleVersionKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="UIApplicationStateRestorationUserInterfaceIdiomKey", optional=true)
    public static native NSString ApplicationStateRestorationUserInterfaceIdiomKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIApplicationStateRestorationTimestampKey", optional=true)
    public static native NSString ApplicationStateRestorationTimestampKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIApplicationStateRestorationSystemVersionKey", optional=true)
    public static native NSString ApplicationStateRestorationSystemVersionKey();
    @GlobalValue(symbol="UICollectionElementKindSectionHeader", optional=true)
    public static native String CollectionElementKindSectionHeader();
    @GlobalValue(symbol="UICollectionElementKindSectionFooter", optional=true)
    public static native String CollectionElementKindSectionFooter();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalValue(symbol="UIDocumentStateChangedNotification", optional=true)
    public static native String Value__UIDocumentStateChangedNotification();
    @GlobalValue(symbol="UINavigationControllerHideShowBarDuration", optional=true)
    public static native @MachineSizedFloat double NavigationControllerHideShowBarDuration();
    @GlobalValue(symbol="UIImagePickerControllerMediaType", optional=true)
    public static native NSString ImagePickerControllerMediaType();
    @GlobalValue(symbol="UIImagePickerControllerOriginalImage", optional=true)
    public static native NSString ImagePickerControllerOriginalImage();
    @GlobalValue(symbol="UIImagePickerControllerEditedImage", optional=true)
    public static native NSString ImagePickerControllerEditedImage();
    @GlobalValue(symbol="UIImagePickerControllerCropRect", optional=true)
    public static native NSString ImagePickerControllerCropRect();
    @GlobalValue(symbol="UIImagePickerControllerMediaURL", optional=true)
    public static native NSString ImagePickerControllerMediaURL();
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalValue(symbol="UIImagePickerControllerReferenceURL", optional=true)
    public static native NSString ImagePickerControllerReferenceURL();
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalValue(symbol="UIImagePickerControllerMediaMetadata", optional=true)
    public static native NSString ImagePickerControllerMediaMetadata();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalValue(symbol="UILocalNotificationDefaultSoundName", optional=true)
    public static native String LocalNotificationDefaultSoundName();
    @GlobalValue(symbol="UIMenuControllerWillShowMenuNotification", optional=true)
    public static native String Value__UIMenuControllerWillShowMenuNotification();
    @GlobalValue(symbol="UIMenuControllerDidShowMenuNotification", optional=true)
    public static native String Value__UIMenuControllerDidShowMenuNotification();
    @GlobalValue(symbol="UIMenuControllerWillHideMenuNotification", optional=true)
    public static native String Value__UIMenuControllerWillHideMenuNotification();
    @GlobalValue(symbol="UIMenuControllerDidHideMenuNotification", optional=true)
    public static native String Value__UIMenuControllerDidHideMenuNotification();
    @GlobalValue(symbol="UIMenuControllerMenuFrameDidChangeNotification", optional=true)
    public static native String Value__UIMenuControllerMenuFrameDidChangeNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="UINibExternalObjects", optional=true)
    public static native NSString NibExternalObjects();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @GlobalValue(symbol="UINibProxiedObjectsKey", optional=true)
    public static native NSString NibProxiedObjectsKey();
    @GlobalValue(symbol="UIPasteboardNameGeneral", optional=true)
    public static native String PasteboardNameGeneral();
    @GlobalValue(symbol="UIPasteboardNameFind", optional=true)
    public static native String PasteboardNameFind();
    @GlobalValue(symbol="UIPasteboardChangedNotification", optional=true)
    public static native String Value__UIPasteboardChangedNotification();
    @GlobalValue(symbol="UIPasteboardChangedTypesAddedKey", optional=true)
    public static native NSString PasteboardChangedTypesAddedKey();
    @GlobalValue(symbol="UIPasteboardChangedTypesRemovedKey", optional=true)
    public static native NSString PasteboardChangedTypesRemovedKey();
    @GlobalValue(symbol="UIPasteboardRemovedNotification", optional=true)
    public static native String Value__UIPasteboardRemovedNotification();
    @GlobalValue(symbol="UIPasteboardTypeListString", optional=true)
    public static native NSArray<NSString> PasteboardTypeListString();
    @GlobalValue(symbol="UIPasteboardTypeListURL", optional=true)
    public static native NSArray<NSString> PasteboardTypeListURL();
    @GlobalValue(symbol="UIPasteboardTypeListImage", optional=true)
    public static native NSArray<NSString> PasteboardTypeListImage();
    @GlobalValue(symbol="UIPasteboardTypeListColor", optional=true)
    public static native NSArray<NSString> PasteboardTypeListColor();
    @GlobalValue(symbol="UIPrintErrorDomain", optional=true)
    public static native String PrintErrorDomain();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UITransitionContextFromViewControllerKey", optional=true)
    public static native NSString TransitionContextFromViewControllerKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UITransitionContextToViewControllerKey", optional=true)
    public static native NSString TransitionContextToViewControllerKey();
    @GlobalValue(symbol="UITextViewTextDidBeginEditingNotification", optional=true)
    public static native String Value__UITextViewTextDidBeginEditingNotification();
    @GlobalValue(symbol="UITextViewTextDidChangeNotification", optional=true)
    public static native String Value__UITextViewTextDidChangeNotification();
    @GlobalValue(symbol="UITextViewTextDidEndEditingNotification", optional=true)
    public static native String Value__UITextViewTextDidEndEditingNotification();
    @GlobalValue(symbol="UIWindowLevelNormal", optional=true)
    public static native @MachineSizedFloat double WindowLevelNormal();
    @GlobalValue(symbol="UIWindowLevelAlert", optional=true)
    public static native @MachineSizedFloat double WindowLevelAlert();
    @GlobalValue(symbol="UIWindowLevelStatusBar", optional=true)
    public static native @MachineSizedFloat double WindowLevelStatusBar();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="NSFontAttributeName", optional=true)
    public static native NSString FontAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="NSParagraphStyleAttributeName", optional=true)
    public static native NSString ParagraphStyleAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="NSForegroundColorAttributeName", optional=true)
    public static native NSString ForegroundColorAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="NSBackgroundColorAttributeName", optional=true)
    public static native NSString BackgroundColorAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="NSLigatureAttributeName", optional=true)
    public static native NSString LigatureAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="NSKernAttributeName", optional=true)
    public static native NSString KernAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="NSStrikethroughStyleAttributeName", optional=true)
    public static native NSString StrikethroughStyleAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="NSUnderlineStyleAttributeName", optional=true)
    public static native NSString UnderlineStyleAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="NSStrokeColorAttributeName", optional=true)
    public static native NSString StrokeColorAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="NSStrokeWidthAttributeName", optional=true)
    public static native NSString StrokeWidthAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="NSShadowAttributeName", optional=true)
    public static native NSString ShadowAttributeName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSTextEffectAttributeName", optional=true)
    public static native NSString TextEffectAttributeName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSAttachmentAttributeName", optional=true)
    public static native NSString AttachmentAttributeName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSLinkAttributeName", optional=true)
    public static native NSString LinkAttributeName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSBaselineOffsetAttributeName", optional=true)
    public static native NSString BaselineOffsetAttributeName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSUnderlineColorAttributeName", optional=true)
    public static native NSString UnderlineColorAttributeName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSStrikethroughColorAttributeName", optional=true)
    public static native NSString StrikethroughColorAttributeName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSObliquenessAttributeName", optional=true)
    public static native NSString ObliquenessAttributeName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSExpansionAttributeName", optional=true)
    public static native NSString ExpansionAttributeName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSWritingDirectionAttributeName", optional=true)
    public static native NSString WritingDirectionAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="NSVerticalGlyphFormAttributeName", optional=true)
    public static native NSString VerticalGlyphFormAttributeName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSTextEffectLetterpressStyle", optional=true)
    public static native NSString TextEffectLetterpressStyle();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSPlainTextDocumentType", optional=true)
    public static native NSString PlainTextDocumentType();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSRTFTextDocumentType", optional=true)
    public static native NSString RTFTextDocumentType();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSRTFDTextDocumentType", optional=true)
    public static native NSString RTFDTextDocumentType();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSHTMLTextDocumentType", optional=true)
    public static native NSString HTMLTextDocumentType();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSTextLayoutSectionOrientation", optional=true)
    public static native NSString TextLayoutSectionOrientation();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSTextLayoutSectionRange", optional=true)
    public static native NSString TextLayoutSectionRange();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSDocumentTypeDocumentAttribute", optional=true)
    public static native NSString DocumentTypeDocumentAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSCharacterEncodingDocumentAttribute", optional=true)
    public static native NSString CharacterEncodingDocumentAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSDefaultAttributesDocumentAttribute", optional=true)
    public static native NSString DefaultAttributesDocumentAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSPaperSizeDocumentAttribute", optional=true)
    public static native NSString PaperSizeDocumentAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSPaperMarginDocumentAttribute", optional=true)
    public static native NSString PaperMarginDocumentAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSViewSizeDocumentAttribute", optional=true)
    public static native NSString ViewSizeDocumentAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSViewZoomDocumentAttribute", optional=true)
    public static native NSString ViewZoomDocumentAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSViewModeDocumentAttribute", optional=true)
    public static native NSString ViewModeDocumentAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSReadOnlyDocumentAttribute", optional=true)
    public static native NSString ReadOnlyDocumentAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSBackgroundColorDocumentAttribute", optional=true)
    public static native NSString BackgroundColorDocumentAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSHyphenationFactorDocumentAttribute", optional=true)
    public static native NSString HyphenationFactorDocumentAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSDefaultTabIntervalDocumentAttribute", optional=true)
    public static native NSString DefaultTabIntervalDocumentAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSTextLayoutSectionsAttribute", optional=true)
    public static native NSString TextLayoutSectionsAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSTextStorageWillProcessEditingNotification", optional=true)
    public static native String Value__NSTextStorageWillProcessEditingNotification();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSTextStorageDidProcessEditingNotification", optional=true)
    public static native String Value__NSTextStorageDidProcessEditingNotification();
    /*</methods>*/
}
