/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Dimension;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Felipe
 */
public class RoundButton extends RoundCornerButton {
  public RoundButton(String text) {
    super(text);
    setFocusPainted(false);
    initShape();
  }
  @Override public Dimension getPreferredSize() {
    Dimension d = super.getPreferredSize();
    d.width = d.height = Math.max(d.width, d.height);
    return d;
  }
  @Override
  protected void initShape() {
    if(!getBounds().equals(base)) {
      base = getBounds();
      shape = new Ellipse2D.Float(0, 0, getWidth()-1, getHeight()-1);
      border = new Ellipse2D.Float(focusstroke, focusstroke,
                                   getWidth()-1-focusstroke*2,
                                   getHeight()-1-focusstroke*2);
    }
  }
}