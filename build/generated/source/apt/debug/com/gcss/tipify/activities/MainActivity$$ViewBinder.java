// Generated code from Butter Knife. Do not modify!
package com.gcss.tipify.activities;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class MainActivity$$ViewBinder<T extends MainActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends MainActivity> implements Unbinder {
    protected T target;

    private View view2131492972;

    private View view2131492974;

    private View view2131492975;

    private View view2131492976;

    protected InnerUnbinder(final T target, Finder finder, Object source) {
      this.target = target;

      View view;
      target.inputBill = finder.findRequiredViewAsType(source, 2131492971, "field 'inputBill'", EditText.class);
      view = finder.findRequiredView(source, 2131492972, "field 'btnLimpiar' and method 'handleClickClear'");
      target.btnLimpiar = finder.castView(view, 2131492972, "field 'btnLimpiar'");
      view2131492972 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.handleClickClear();
        }
      });
      target.inputPercentage = finder.findRequiredViewAsType(source, 2131492973, "field 'inputPercentage'", EditText.class);
      view = finder.findRequiredView(source, 2131492974, "field 'btnIncrease' and method 'handleClickIncrease'");
      target.btnIncrease = finder.castView(view, 2131492974, "field 'btnIncrease'");
      view2131492974 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.handleClickIncrease();
        }
      });
      view = finder.findRequiredView(source, 2131492975, "field 'btnDecrease' and method 'handleClickDecrease'");
      target.btnDecrease = finder.castView(view, 2131492975, "field 'btnDecrease'");
      view2131492975 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.handleClickDecrease();
        }
      });
      view = finder.findRequiredView(source, 2131492976, "field 'btnCalcular' and method 'handleClickSubmit'");
      target.btnCalcular = finder.castView(view, 2131492976, "field 'btnCalcular'");
      view2131492976 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.handleClickSubmit();
        }
      });
      target.txtTip = finder.findRequiredViewAsType(source, 2131492978, "field 'txtTip'", TextView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.inputBill = null;
      target.btnLimpiar = null;
      target.inputPercentage = null;
      target.btnIncrease = null;
      target.btnDecrease = null;
      target.btnCalcular = null;
      target.txtTip = null;

      view2131492972.setOnClickListener(null);
      view2131492972 = null;
      view2131492974.setOnClickListener(null);
      view2131492974 = null;
      view2131492975.setOnClickListener(null);
      view2131492975 = null;
      view2131492976.setOnClickListener(null);
      view2131492976 = null;

      this.target = null;
    }
  }
}
