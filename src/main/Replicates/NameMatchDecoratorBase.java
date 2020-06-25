import org.jibx.util.NameUtilities;

/**
 * Base class for decorators which match on the generated class name.
 */
public abstract class NameMatchDecoratorBase implements ClassDecorator
{
    /** Name pattern to be matched (<code>null</code> if none). */
    private String m_matchName;

    /**
     * Set name pattern to be matched.
     *
     * @param match pattern to be matched (<code>null</code> if none, meaning match every name)
     */
    public void setMatchName(String match) {
        m_matchName = match;
    }

    /**
     * Match class name against pattern.
     *
     * @param name
     * @return <code>true</code> if name matches pattern, <code>false</code> if not
     */
    protected boolean matchName(String name) {
        if (m_matchName != null) {
            return NameUtilities.isPatternMatch(name, m_matchName);
        }
        return true;
    }
}
