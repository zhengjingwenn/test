package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test.rev150105;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>test</b>
 * <pre>
 * container output {
 *     leaf greeting {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>test/test-world/output</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test.rev150105.TestWorldOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test.rev150105.TestWorldOutputBuilder
 *
 */
public interface TestWorldOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test.rev150105.TestWorldOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:test",
        "2015-01-05", "output").intern();

    /**
     * @return <code>java.lang.String</code> <code>greeting</code>, or <code>null</code> if not present
     */
    java.lang.String getGreeting();

}

