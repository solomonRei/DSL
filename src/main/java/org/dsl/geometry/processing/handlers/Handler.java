package org.dsl.geometry.processing.handlers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.dsl.geometry.processing.elements.Drawable;

import java.util.List;

/**
 * Interface for handling a specific type of context.
 *
 * @param <T> the type of context to handle
 */
public interface Handler<T extends ParserRuleContext> {
  List<Drawable> handle(T context);
}
