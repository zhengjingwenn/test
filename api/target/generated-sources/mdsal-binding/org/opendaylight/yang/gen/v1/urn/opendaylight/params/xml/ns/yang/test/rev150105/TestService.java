package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test.rev150105;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>test</b>
 * <pre>
 * rpc test-world {
 *     input {
 *         leaf name {
 *             type string;
 *         }
 *     }
 *     
 *     output {
 *         leaf greeting {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface TestService
    extends
    RpcService
{




    Future<RpcResult<TestWorldOutput>> testWorld(TestWorldInput input);

}

