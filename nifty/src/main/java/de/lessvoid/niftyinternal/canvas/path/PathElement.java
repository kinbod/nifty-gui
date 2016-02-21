/*
 * Copyright (c) 2015, Nifty GUI Community 
 * All rights reserved. 
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are 
 * met: 
 * 
 *  * Redistributions of source code must retain the above copyright 
 *    notice, this list of conditions and the following disclaimer. 
 *  * Redistributions in binary form must reproduce the above copyright 
 *    notice, this list of conditions and the following disclaimer in the 
 *    documentation and/or other materials provided with the distribution. 
 * 
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS ``AS IS'' AND 
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF 
 * THE POSSIBILITY OF SUCH DAMAGE.
 */
package de.lessvoid.niftyinternal.canvas.path;

import de.lessvoid.niftyinternal.canvas.LineParameters;
import de.lessvoid.niftyinternal.math.Mat4;
import de.lessvoid.niftyinternal.math.Vec2;
import de.lessvoid.niftyinternal.render.batch.BatchManager;

/**
 * A PathElement.
 * @author void
 */
public interface PathElement {

  /**
   * Return the point on the path AFTER this PathElement has been applied.
   *
   * @param pathLastPoint The current pathLastPoint. Please note that this can be null.
   * @return the new pathLastPoint after this PathElement has been added to the path
   */
  Vec2 getPathPoint(Vec2 pathLastPoint);

  /**
   * Render this path element as a stroke to the batchManager using data from the Context and the parameters given.
   *
   * @param lineParameters the LineParameters to use when stroking the path
   * @param transform the Transformation to applied when adding this to the batchManager
   * @param batchManager the BatchManager
   */
  void stroke(LineParameters lineParameters, Mat4 transform, BatchManager batchManager);

  /**
   * Render this path element as a fill to the batchManager using data from the Context and the parameters given.
   *
   * @param transform the Context
   * @param batchManager the BatchManager
   */
  void fill(Mat4 transform, BatchManager batchManager);
}
