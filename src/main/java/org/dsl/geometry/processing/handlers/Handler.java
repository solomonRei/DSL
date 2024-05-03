package org.dsl.geometry.processing.handlers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.dsl.geometry.processing.elements.Drawable;

import java.util.List;
import java.util.Map;

/**
 * Interface for handling a specific type of context.
 *
 * @param <T> the type of context to handle
 */
public interface Handler<T extends ParserRuleContext> {
  Map<String, Drawable> handle(T context);
}
